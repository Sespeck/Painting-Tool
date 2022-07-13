package seanwang.paint

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import seanwang.paint.PaintView.Companion.currentPaint
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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.blackPaint.setOnClickListener{
            paintBrush.color = ContextCompat.getColor(this, R.color.black)
            currentColor(paintBrush.color)
        }
        binding.redPaint.setOnClickListener{ paintBrush.color = ContextCompat.getColor(this, R.color.red); currentColor(paintBrush.color)}
        binding.bluePaint.setOnClickListener{ paintBrush.color = ContextCompat.getColor(this, R.color.blue); currentColor(paintBrush.color)}
        binding.yellowPaint.setOnClickListener{ paintBrush.color = ContextCompat.getColor(this, R.color.yellow); currentColor(paintBrush.color)}
        binding.whitePaint.setOnClickListener{ paintBrush.color = ContextCompat.getColor(this, R.color.white); currentColor(paintBrush.color)}
    }

    private fun currentColor(color: Int){
        currentPaint = color
        path = Path()
    }
}