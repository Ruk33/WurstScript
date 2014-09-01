package de.peeeq.wurstio.dependencies;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.ReflogEntry;
import org.eclipse.jgit.lib.ReflogReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.FetchResult;
import org.eclipse.jgit.treewalk.TreeWalk;

public class EgitTest {
	
	public static void main(String[] args) throws InvalidRemoteException, TransportException, GitAPIException, IOException {
		File targetDir = new File("./test-output/gittest/");
		String url = "git@github.com:muzzel/Momentum.git";
		if (!targetDir.exists()) {
//		deleteDir(targetDir);
			CloneCommand cmd = Git.cloneRepository();
			cmd.setURI(url);
			cmd.setDirectory(targetDir);
			Git r = cmd.call();
		}
		
		
		Git r = Git.open(targetDir);
		
//		r.checkout().setName("094e36d803a9df925da0ab8a973f178e4ad095ca").call();
		r.checkout().setName("master").call();
		
		FetchResult res = r.fetch().call();
		System.out.println("fetch result: " + res.getMessages());
		
		Repository repo = r.getRepository();
		Map<String, Ref> refs = repo.getAllRefs();
		for (Entry<String, Ref> e : refs.entrySet()) {
			System.out.println("  " + e.getKey() + " -> " + e.getValue());
			
		}
		Iterable<RevCommit> log = r.log().call();
		for (RevCommit revCommit : log) {
			System.out.println(" || " + revCommit);
			System.out.println(" author = " + revCommit.getAuthorIdent());
			System.out.println(" author = " + revCommit.getFullMessage());
		}
		
	}

	private static void deleteDir(File targetDir) throws IOException {
		Files.walkFileTree(targetDir.toPath(), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.deleteIfExists(file);
				return FileVisitResult.CONTINUE;
			}
			
			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.deleteIfExists(dir);
				return FileVisitResult.CONTINUE;
			}
		});
	}

}
