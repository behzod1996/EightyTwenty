package uz.behzoddev.common_ui

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

val Fragment.navController: NavController
    get() = findNavController()