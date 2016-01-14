package com.jain.mokshymargdharm;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class SongsManager {
	// SDCard Path

   //  File extStore = Environment.getExternalStorageDirectory();
   //  final String MEDIA_PATH ;
   //  final String MEDIA_PATH = new String("/res/raw/");
	//  final String MEDIA_PATH = new String("/storage/emulated/0/Download/");
	private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
   /* private ArrayList<File> songsListFile = new ArrayList<File>();
    private String[] songListFile;
*/	// Constructor
	/*public SongsManager(String media_path){

        MEDIA_PATH = media_path;
    }*/
	
	/**
	 * Function to read all mp3 files from sdcard
	 * and store the details in ArrayList
	 * */

// Constructor
    public SongsManager(){

    }


 	public ArrayList<HashMap<String, String>> getPlayList(){
		//  File home = new File(MEDIA_PATH);
        HashMap<String, String> song1 = new HashMap<String, String>();
        HashMap<String, String> song2 = new HashMap<String, String>();

        song1.put("songTitle",  "मेरी भावना");
        song1.put("songPath", "android.resource://" + AndroidBuildingMusicPlayerActivity.PACKAGE_NAME +"/"+ R.raw.jainbhajan);

        songsList.add(song1);

        song2.put("songTitle",  "नवकार मंत्र");
        song2.put("songPath","android.resource://" + AndroidBuildingMusicPlayerActivity.PACKAGE_NAME +"/"+ R.raw.navkarmantra);
        songsList.add(song2);


//        File List[] = Environment.getExternalStorageDirectory().listFiles();
//
//        System.out.println("File name ------------> "+ List[0].getName() + "List[0].isFile() "+List[0].isFile() + "Lengh "+List.length);
//        File home;
//
//        int index=0;
//
//        while(index<List.length)
//        {
//            home = new File(List[index].getAbsolutePath().toString());

      //   File home = Environment.getExternalStorageDirectory();
//        System.out.println("File name HOMME ------------> "+ home);
//         System.out.println("File name ------------> "+ home.getName()+ "List[0].isFile() "+home.isFile() + "Lengh ");
//

/*for(String fileStr : songListFile ) {

    File home = new File(fileStr);
    if (home.listFiles(new FileExtensionFilter()).length > 0) {
        System.out.println("File name IFFFF ------------> ");
        for (File file : home.listFiles(new FileExtensionFilter())) {

            System.out.println("File name FOR ------------> ");
            HashMap<String, String> song = new HashMap<String, String>();
            song.put("songTitle", file.getName().substring(0, (file.getName().length() - 4)));
            song.put("songPath", file.getPath());

            // Adding each song to SongList
            songsList.add(song);
        }
        //}
    }

}*/




        /*HashMap<String, String> song = new HashMap<String, String>();
        song.put("songTitle", "Navkar mantra");
        song.put("songPath", file.getPath());
		*/// return songs list array
		return songsList;
	}
	
	/**
	 * Class to filter files which are having .mp3 extension
	 * */
	class FileExtensionFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return (name.endsWith(".mp3") || name.endsWith(".MP3"));
		}
	}
}
