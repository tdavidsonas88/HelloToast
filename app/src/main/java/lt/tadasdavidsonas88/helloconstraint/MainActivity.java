package lt.tadasdavidsonas88.helloconstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    /**
     * When the TOAST button is clicked, show a toast.
     * @param view - view the view that triggers  this onClick handler.
     *             Since a toast always show on the top, view is not used.
     */
    public void showToast(View view) {
        // Create a toast
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        // Show toast
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
