/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package org.andresoviedo.dddmodel;

public final class R {
    public static final class array {
        public static final int menu_items=0x7f080000;
    }
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f050000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f060000;
        public static final int activity_vertical_margin=0x7f060001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
    }
    public static final class id {
        public static final int action_settings=0x7f0b0009;
        public static final int activity_menu_item=0x7f0b0002;
        public static final int browse_texture_button=0x7f0b0006;
        public static final int demo_item_icon=0x7f0b0000;
        public static final int demo_item_title=0x7f0b0001;
        public static final int dialog_load_model_invert_textures=0x7f0b0007;
        public static final int dialog_load_model_load=0x7f0b0008;
        public static final int dialog_load_model_name=0x7f0b0004;
        public static final int dialog_load_model_texture=0x7f0b0005;
        public static final int model_toggle_boundingbox=0x7f0b000b;
        public static final int model_toggle_lights=0x7f0b000d;
        public static final int model_toggle_textures=0x7f0b000c;
        public static final int model_toggle_wireframe=0x7f0b000a;
        public static final int text_activity_text=0x7f0b0003;
    }
    public static final class layout {
        public static final int activity_demo=0x7f030000;
        public static final int activity_demo_item=0x7f030001;
        public static final int activity_main=0x7f030002;
        public static final int activity_menu=0x7f030003;
        public static final int activity_menu_item=0x7f030004;
        public static final int activity_model=0x7f030005;
        public static final int activity_text=0x7f030006;
        public static final int dialog_load_model=0x7f030007;
    }
    public static final class menu {
        public static final int main=0x7f0a0000;
        public static final int menu=0x7f0a0001;
        public static final int model=0x7f0a0002;
    }
    public static final class raw {
        public static final int ic_launcher=0x7f040000;
    }
    public static final class string {
        /**  About 
         */
        public static final int about_text=0x7f07000a;
        public static final int action_settings=0x7f070002;
        /**  To review 
         */
        public static final int app_logo_desc=0x7f070015;
        public static final int app_name=0x7f070000;
        public static final int app_version=0x7f070001;
        public static final int cancel=0x7f07000e;
        /**  Help 
         */
        public static final int help_text=0x7f070009;
        public static final int image=0x7f070008;
        public static final int invert_texture_coordinates=0x7f07000d;
        /**  Demo menu 
         */
        public static final int item=0x7f070007;
        public static final int load=0x7f07000f;
        public static final int load_model=0x7f070010;
        /**  Load settings 
         */
        public static final int model_name=0x7f07000b;
        public static final int texture=0x7f07000c;
        public static final int title_activity_demo=0x7f070004;
        /**  Activities 
         */
        public static final int title_activity_menu=0x7f070003;
        public static final int title_activity_model=0x7f070006;
        public static final int title_activity_text=0x7f070005;
        public static final int toggle_boundingbox=0x7f070014;
        public static final int toggle_lights=0x7f070013;
        public static final int toggle_textures=0x7f070012;
        /**  GL Settings 
         */
        public static final int toggle_wireframe=0x7f070011;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f090000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f090001;
        public static final int ButtonBar=0x7f090003;
        public static final int ButtonBarButton=0x7f090004;
        public static final int FullscreenActionBarStyle=0x7f090005;
        public static final int FullscreenTheme=0x7f090002;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle org.andresoviedo.dddmodel:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle org.andresoviedo.dddmodel:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link org.andresoviedo.dddmodel.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name org.andresoviedo.dddmodel:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link org.andresoviedo.dddmodel.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name org.andresoviedo.dddmodel:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
