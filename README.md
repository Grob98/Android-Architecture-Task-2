# Aufgabe 2

Für diese Aufgabe wurde eine kleine Aufgaben-App erstellt. Die Hauptansicht besteht aus einem TextView am oberen Bildschirmrand, der die aktuelle Aufgabe anzeigen soll. Diese kann durch die Eingabe in den EditText am unteren Bildschirmrand und das Drücken auf den Button geändert werden.
</br></br>

### 2.1
Das TaskFragment ist momentan mit findViewById() implementiert. Ändere die Implementation so um, dass nun View Binding genutzt wird. View Binding ist bereits in der build.gradle aktiviert. 
</br></br>

### 2.2
Die Variable currentTask in der Klasse TaskViewModel soll nun ein LiveData-Objekt sein. Ändere die Implementierung in den Klassen TaskViewModel und TaskFragment dementsprechend.

**Hinweis:** In dem TaskFragment muss ein Observer registriert werden.
