package cn.cloudwalk.myapplication

import android.animation.ObjectAnimator
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import cn.cloudwalk.myapplication.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.ImageViewTarget

class MainActivity : AppCompatActivity() {

    private lateinit var rotateAnimator:ObjectAnimator
    private lateinit var activityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(activityBinding.root)
        //旋转动画，使用属性动画
        rotateAnimator = ObjectAnimator.ofFloat(activityBinding.musicAvatar, View.ROTATION, 0f, 360f)
        rotateAnimator.duration = 6000
        rotateAnimator.repeatCount = -1
        rotateAnimator.interpolator = LinearInterpolator()
        loadImage()
    }


    private fun loadImage() {
            Glide.with(this@MainActivity)
                .load(R.mipmap.icon_music)
                .circleCrop()
                .into(object : ImageViewTarget<Drawable>(activityBinding.musicAvatar) {
                    override fun setResource(resource: Drawable?) {
                        activityBinding.musicAvatar.setImageDrawable(resource)
                    }
                })
        rotateAnimator.start()
    }



}
