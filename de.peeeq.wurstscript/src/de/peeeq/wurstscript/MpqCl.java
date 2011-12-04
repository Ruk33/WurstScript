package de.peeeq.wurstscript;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MpqCl implements MpqEditor {
	@Override
	public void extractFile(File mpqArchive, String fileToExtract, File tempFile) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		String[] commands = {"MpqCL.exe", "extract", mpqArchive.getAbsolutePath(), fileToExtract, tempFile.getAbsolutePath()};
		Process proc = rt.exec(commands);
		InputStream procOut = proc.getInputStream();
		BufferedReader procOutReader = new BufferedReader(new InputStreamReader(procOut));
		proc.waitFor();
		String line;
		while ((line = procOutReader.readLine()) != null) {
			WLogger.info(line);
		}
	}
	@Override
	public void insertFile(File mpqArchive, String filenameInMpq, File tempFile) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		String[] commands = {"MpqCL.exe", "inject", mpqArchive.getAbsolutePath(), filenameInMpq, tempFile.getAbsolutePath()};
		Process proc = rt.exec(commands);
		InputStream procOut = proc.getInputStream();
		BufferedReader procOutReader = new BufferedReader(new InputStreamReader(procOut));
		proc.waitFor();
		String line;
		while ((line = procOutReader.readLine()) != null) {
			WLogger.info(line);
		}
	}
	@Override
	public void deleteFile(File mpqArchive, String filenameInMpq)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		throw new Error("not implemented");
	}
}