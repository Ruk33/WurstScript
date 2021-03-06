package de.peeeq.eclipsewurstplugin.builder;

import java.io.File;
import java.io.Reader;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import de.peeeq.eclipsewurstplugin.editor.CompilationUnitChangeListener;
import de.peeeq.wurstscript.ast.CompilationUnit;
import de.peeeq.wurstscript.ast.WurstModel;
import de.peeeq.wurstscript.gui.WurstGui;

public interface ModelManager {

	 boolean removeCompilationUnit(IResource resource);

	 boolean needsFullBuild();

	 void clean();

	 void typeCheckModel(WurstGui gui, boolean addErrorMarkers);
	 
	 void typeCheckModelPartial(WurstGui gui, boolean addErrorMarkers, List<CompilationUnit> toCheck);
	 
	 void updateModel(CompilationUnit cu, WurstGui gui);

	 @Nullable CompilationUnit getCompilationUnit(String fileName);

	 void registerChangeListener(String fileName, CompilationUnitChangeListener listener);

	 CompilationUnit parse(WurstGui gui, String fileName, Reader source);

	 void fullBuildDone();

	void addDependency(File f);

	void clearDependencies();

	@Nullable WurstModel getModel();
	
	WurstNature getNature();

	void removeCompilationUnitByName(String replDummyFilename);

	void resolveImports(WurstGui gui);

	Set<String> getDependencies();

	Set<@NonNull File> getDependencyWurstFiles();

}