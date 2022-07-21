package uz.behzoddev.common_ui.extensions

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

inline fun <reified T : AppCompatActivity> Activity.start(block: Intent.() -> Unit = {}) {
    val intent = Intent(this, T::class.java)
    intent.apply(block)
    startActivity(intent)
}

inline fun <reified T : FragmentActivity> Activity.launchWithFragmentActivity(block: Intent.() -> Unit = {}) {
    val intent = Intent(this, T::class.java)
    intent.apply(block)
    startActivity(intent)
}

inline fun <reified T : Activity> Activity.startAndFinish(block: Intent.() -> Unit = {}) {
    val intent = Intent(this, T::class.java)
    intent.apply(block)
    startActivity(intent)
    finish()
}

inline fun <reified T : AppCompatActivity> Activity.launchAndFinishWithCompat(block: Intent.() -> Unit = {}) {
    val intent = Intent(this, T::class.java)
    intent.apply(block)
    startActivity(intent)
    finish()
}

inline fun <reified T : Activity> Fragment.launch(block : Intent.() -> Unit = {}) {
    val intent = Intent(requireContext(), T::class.java)
    intent.apply(block)
    startActivity(intent)
}

inline fun <reified T : Activity> Fragment.launchAndFinish(block: Intent.() -> Unit = {}) {
    val intent = Intent(requireContext(), T::class.java)
    intent.apply(block)
    startActivity(intent)
    requireActivity().finish()
}
