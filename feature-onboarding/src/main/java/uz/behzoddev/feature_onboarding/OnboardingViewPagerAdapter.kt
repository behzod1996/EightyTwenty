package uz.behzoddev.feature_onboarding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class OnboardingViewPagerAdapter(
    private val context: Context,
    screens: List<OnboardingItem>
): PagerAdapter() {

    private var listScreen: List<OnboardingItem>


    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val screen = inflater.inflate(R.layout.onboarding_screen,null)

        val image = screen.findViewById<ImageView>(R.id.iv_screen)
        val title = screen.findViewById<TextView>(R.id.tv_title)
        val description = screen.findViewById<TextView>(R.id.tv_description)

        title.text = listScreen[position].title.toString()
        description.text = listScreen[position].description.toString()
        image.setImageResource(listScreen[position].image)

        container.addView(screen)

        return screen
    }

    override fun getCount(): Int {
        return listScreen.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }


    init {
        this.listScreen = screens
    }
}