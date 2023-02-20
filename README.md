# Bet2RankApp
Dissertation project: Java web application that allows users to register and login to an account, as well as view a leader board of other users. 
This was created using data from an SQL database and designed using Java Servlet. 

To run the project you will need to create a DB with the following fields:

Username varchar(255),
BetsPlaced int,
BetsWon int,
SuccessRate int,
Email varchar(255),
Password varchar(255)

And populate these fields with data (at least 10 to fill the leaderboard).
Edit the DBUtil class to the path of where your DB is stored.
Then, running the code should take you to a web page where you can login with credentials from the DB, and view the leaderboard.
If you don't want to fill the DB through SQL or want to add a single other account, you can register for an account on the web page, but you need to
add the values in on the DB in order for the account to show on the leaderboard.
