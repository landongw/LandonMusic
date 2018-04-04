package wiedenman.com.landonmusic;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class DownloadThread extends Thread {

    private static final String TAG = DownloadThread.class.getSimpleName();

    @Override
    public void run() {
        for (String song : PlayList.songs) {
            downloadSong();
        }
    }

    private void downloadSong() {
        long endTime = System.currentTimeMillis() + 10*1000;  // simulates a 10 second download
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);// wait one second before looping
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "Song downloaded!");
    }
}
