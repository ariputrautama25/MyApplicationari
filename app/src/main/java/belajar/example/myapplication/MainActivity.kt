package belajar.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membuat aksi ketika button di klik
        val tombolAksi: Button = findViewById(R.id.buttonGanti)
        tombolAksi.setOnClickListener {
            ubahAngka()
        }

    }
}

//fungsi ketika tombol di klik akan di panggil fungsi ini
private fun ubahAngka(){
    //messagebox simple untuk menampilkan teks


    //mengubah isi textbox
    val txtHello: TextView = findViewById(R.id.txtdadu1)
    val txtDadu2: TextView = findViewById(R.id.txtdadu2)
    val txtDadu3: TextView = findViewById(R.id.txtDadu3)
    Toast.makeText(this, "button clicked1",
        Toast.LENGTH_SHORT).show()
    val randomInt=(1..6).random()
    val tes = (1 until 6).random()
    val tes2 = (1 until 6).random()
    val tes3 = (1 until 6).random()
    Toast.makeText(this, "button clicked2",
        Toast.LENGTH_SHORT).show()
    txtHello.text = tes.toString()
    txtDadu2.text = tes2.toString()
    txtDadu3.text = tes3.toString()

}
