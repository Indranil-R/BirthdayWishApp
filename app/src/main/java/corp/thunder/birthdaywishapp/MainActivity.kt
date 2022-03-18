package corp.thunder.birthdaywishapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createCard(view: View) {
        val tvName = findViewById<EditText>(R.id.tvName)
        val name = tvName.editableText.toString()

        if (name.isNotEmpty()){
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
            startActivity(intent)
        }
        if (name.isEmpty() ){
                Toast.makeText(this,"Please Enter a name",Toast.LENGTH_SHORT).show()
        }


    }


}