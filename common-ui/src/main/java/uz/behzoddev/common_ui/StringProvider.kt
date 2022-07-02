package uz.behzoddev.common_ui

import android.content.Context
import androidx.annotation.StringRes
import dagger.hilt.android.qualifiers.ApplicationContext
import uz.behzoddev.common_ui.core.Provider
import javax.inject.Inject

interface StringProvider : Provider {
    fun getString(@StringRes id: Int, vararg args: Any): String
}


class StringProviderImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : StringProvider {

    override fun getString(@StringRes id: Int, vararg args: Any): String {
        return context.getString(id,*args)
    }

}
