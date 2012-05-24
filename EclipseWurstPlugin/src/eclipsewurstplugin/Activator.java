package eclipsewurstplugin;

import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_BOLD;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_COLOR;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_COMMENT;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_CONSTRUCTOR;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_DATATYPE;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_FIELD;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_FUNCTION;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_INTERFACE;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_ITALIC;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_KEYWORD;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_PARAM;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_COMMENT;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_CONSTRUCTOR;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_DATATYPE;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_FIELD;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_FUNCTION;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_INTERFACE;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_KEYWORD;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_PARAM;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_STRING;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_RGB_VAR;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_STRIKETHROUGH;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_STRING;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_UNDERLINE;
import static de.peeeq.eclipsewurstplugin.WurstPlugin.SYNTAXCOLOR_VAR;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "EclipseWurstPlugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		initializePreferenceStore();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	private void initializePreferenceStore(){
		//Initialize default values of preferenceStore
		
		//Colors for syntax highlighting
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_KEYWORD,     SYNTAXCOLOR_RGB_KEYWORD);
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_STRING,      SYNTAXCOLOR_RGB_STRING);
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_COMMENT,     SYNTAXCOLOR_RGB_COMMENT);
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_FUNCTION,    SYNTAXCOLOR_RGB_FUNCTION);
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_DATATYPE,    SYNTAXCOLOR_RGB_DATATYPE);
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_VAR,         SYNTAXCOLOR_RGB_VAR        );
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_PARAM,       SYNTAXCOLOR_RGB_PARAM      );
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_FIELD,       SYNTAXCOLOR_RGB_FIELD      );
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_INTERFACE,   SYNTAXCOLOR_RGB_INTERFACE  );
		setDefaultValue(SYNTAXCOLOR_COLOR + SYNTAXCOLOR_CONSTRUCTOR, SYNTAXCOLOR_RGB_CONSTRUCTOR);

		//Style for syntax highlighting
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_KEYWORD,    true);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_STRING,     false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_COMMENT,    false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_FUNCTION,   false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_DATATYPE,   false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_VAR,        false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_PARAM,      false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_FIELD,      false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_INTERFACE,  false);
		setDefaultValue(SYNTAXCOLOR_BOLD + SYNTAXCOLOR_CONSTRUCTOR,false);
		
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_KEYWORD,    false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_STRING,     false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_COMMENT,    false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_FUNCTION,   true);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_DATATYPE,   false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_VAR,        false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_PARAM,      false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_FIELD,      false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_INTERFACE,  false);
		setDefaultValue(SYNTAXCOLOR_ITALIC + SYNTAXCOLOR_CONSTRUCTOR,true);
		
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_KEYWORD,    false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_STRING,     false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_COMMENT,    false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_FUNCTION,   false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_DATATYPE,   false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_VAR,        false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_PARAM,      false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_FIELD,      false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_INTERFACE,  false);
		setDefaultValue(SYNTAXCOLOR_UNDERLINE + SYNTAXCOLOR_CONSTRUCTOR,false);
		
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_KEYWORD,    false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_STRING,     false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_COMMENT,    false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_FUNCTION,   false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_DATATYPE,   false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_VAR,        false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_PARAM,      false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_FIELD,      false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_INTERFACE,  false);
		setDefaultValue(SYNTAXCOLOR_STRIKETHROUGH + SYNTAXCOLOR_CONSTRUCTOR,false);
		
	}
	
	private void setDefaultValue(String name, boolean value){
		getDefaultPreferenceStore().setDefault(name, value);
	}
	
	private void setDefaultValue(String name, String value){
		getDefaultPreferenceStore().setDefault(name, value);
	}
	
	private void setDefaultValue(String name, RGB value){
		PreferenceConverter.setDefault(getDefaultPreferenceStore(), name, value);
	}
	
	public static IPreferenceStore getDefaultPreferenceStore(){
		return Activator.getDefault().getPreferenceStore();
	}
}