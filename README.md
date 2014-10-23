## How to connect to the server (Mac)
Indtast dette i din terminal: 

`ssh ubuntu@54.172.101.85 -i ~/.ssh/thorn.pem`

- `ubuntu` er brugernavnet
- `54.172.101.85` er ip adressen
- `~/.ssh/thorn.pem` er hvor du har gemt thorns .pem fil


## Kommentarer til Switch
Switch kan:
Create Calender
Delete Calender
getQuote

Switch mangler:
Login - Brug klassen AuthenticateUser (int authenticase) Bør overvejes om det skal være String pga. svar
Logout - Metoden skal oprettes (String metode)
Save Imported Calendar - Brug getCalenderData klassen
get Calendar - Brug getCalenderData klassen
getEvents - Brug Events klassen (ArrayList<Event> getEvents)
Create Event - Metoden mangler at oprettes i Events klassen
getEventInfo - Denne skal oprettes hvis den skal benyttes
deleteEvent - Metode mangler at oprettes i Events klassen
saveNote - Brug Note klassen (void SaveNote)
getNote - Brug Note (NoteModel GetNote)
deleteNote Brug Note (void DeleteNote)
getClientForeacst - Brug Forecast klassen (String toString())

Der skal oprettes:
case: Fileupload
case: CreateNote - Brug Note klassen (void CreateNote)
case: setEvents - Brug Events Klassen (void setEvents)

Hvis Admin kan logge ind via client skal der oprettes specielle ting til ham i Switch.


