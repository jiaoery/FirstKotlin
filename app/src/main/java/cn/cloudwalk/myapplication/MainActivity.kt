package cn.cloudwalk.myapplication

import android.animation.ObjectAnimator
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.ImageViewTarget
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var rotateAnimator:ObjectAnimator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //旋转动画，使用属性动画
        rotateAnimator = ObjectAnimator.ofFloat(music_avatar, View.ROTATION, 0f, 360f)
        rotateAnimator.duration = 6000
        rotateAnimator.repeatCount = -1
        rotateAnimator.interpolator = LinearInterpolator()
        loadImage()
    }


    private fun loadImage() {
            Glide.with(this@MainActivity)
                .load(R.mipmap.icon_music)
                .circleCrop()
                .into(object : ImageViewTarget<Drawable>(music_avatar) {
                    override fun setResource(resource: Drawable?) {
                        music_avatar.setImageDrawable(resource)
                    }
                })
        rotateAnimator.start()
    }


}
