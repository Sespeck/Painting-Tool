package seanwang.paint

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import seanwang.paint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Companion Object works as global variables
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.blackPaint.setOnClickListener{}
    }
}