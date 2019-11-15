# Battleship

Packages

1. ClientGUI - UI to handle Client Logging into Server
2. Client - Client Communications
3. ServerGUI - UI Handle setting up server.
4. Server - Server Communications
5. BattleshipClient - Runs on the Client Side. The UI for playing the game
  a. battleshipData -- Model
      *client.sendToServer(bsc); - this line sends a battleshipComm object to the client to send to the server.
  b. battleshipView -- View
  c. battleshipController -- Controller
      *public void receiveDataFromServer(battleshipComm bsc). -- this line receives the battleshipComm object from the server
  d. battleshipComm -- Data object that the client will send to the server
   
   
   

6. BattleshipServer - Runs on the Server Side. The rule checking for playing the game.



