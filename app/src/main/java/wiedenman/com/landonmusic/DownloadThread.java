package wiedenman.com.landonmusic;

import android.os.Looper;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class DownloadThread extends Thread {

    private static final String TAG = DownloadThread.class.getSimpleName();

    public DownloadHandler mHandler;

    @Override
    public void run() {
        for (String song : PlayList.songs) {
            Looper.prepare();  // Looper gets the messages from the queue
            mHandler = new DownloadHandler();  // Handler processes the messages
            Looper.loop(); // Loop over the message queue
        }
    }


}
