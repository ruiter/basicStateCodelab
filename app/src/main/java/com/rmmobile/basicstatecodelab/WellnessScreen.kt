package com.rmmobile.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(modifier: Modifier = Modifier, viewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StateFulCounter()

        WellnessTasksList(
            list = viewModel.tasks,
            onCloseTask = { viewModel.remove(it) },
            onCheckedTask = { task, checked -> viewModel.changeTaskChecked(task, checked) })
    }
}

