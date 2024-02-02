package com.rmmobile.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.rmmobile.WellnessTask

@Composable
fun WellnessTasksList(
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier,
    list: List<WellnessTask>
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = list, key = {task -> task.id}) { task ->
            WellnessTaskItem(taskName = task.label, onClose = {onCloseTask(task)})
        }
    }
}

//fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }