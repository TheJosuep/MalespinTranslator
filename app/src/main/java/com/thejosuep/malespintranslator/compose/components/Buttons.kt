package com.thejosuep.malespintranslator.compose.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Forum
import androidx.compose.material.icons.rounded.History
import androidx.compose.material.icons.rounded.KeyboardVoice
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thejosuep.malespintranslator.R
import com.thejosuep.malespintranslator.ui.theme.MalespinTranslatorTheme

@Composable
fun ChatButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 120.dp, height = 120.dp),
        shape = RoundedCornerShape(45.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Icon(
            imageVector = Icons.Rounded.Forum,
            contentDescription = stringResource(id = R.string.chat_button_description),
            modifier = Modifier.size(45.dp),
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun VoiceButton(onClick: () -> Unit){
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 95.dp, height = 95.dp),
        shape = RoundedCornerShape(45.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Icon(
            imageVector = Icons.Rounded.KeyboardVoice,
            contentDescription = stringResource(id = R.string.voice_button_description),
            modifier = Modifier.size(35.dp),
            tint = MaterialTheme.colorScheme.onSecondaryContainer
        )
    }
}

@Composable
fun HistoryButton(onClick: () -> Unit){
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 95.dp, height = 95.dp),
        shape = RoundedCornerShape(45.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        )
    ) {
        Icon(
            imageVector = Icons.Rounded.History,
            contentDescription = stringResource(id = R.string.history_button_description),
            modifier = Modifier.size(35.dp),
            tint = MaterialTheme.colorScheme.onTertiaryContainer
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChatButtonPreview() {
    MalespinTranslatorTheme() {
        ChatButton(
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VoiceButtonPreview() {
    MalespinTranslatorTheme {
        VoiceButton(
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HistoryButtonPreview() {
    MalespinTranslatorTheme {
        HistoryButton(
            onClick = {}
        )
    }
}