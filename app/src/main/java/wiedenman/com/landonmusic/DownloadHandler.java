package wiedenman.com.landonmusic;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class DownloadHandler extends Handler {

    private static final String TAG = DownloadHandler.class.getSimpleName();

    @Override
    public void handleMessage(Message msg) {
        downloadSong(msg.obj.toString());
    }

    private void downloadSong(String song) {
        long endTime = System.currentTimeMillis() + 10*1000;  // simulates a 10 second download
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);// wait one second before looping
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, song + " Song downloaded!");
    }
}
