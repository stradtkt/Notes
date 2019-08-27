package com.stradtman.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class NoteEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText addNote = (EditText) findViewById(R.id.addNote);
        Intent intent = getIntent();
        int noteId = intent.getIntExtra("noteId", -1);
        if(noteId != -1) {
            addNote.setText(MainActivity.notes.get(noteId));
        }
    }
}
