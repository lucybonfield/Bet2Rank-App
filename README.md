# Bet2Rank App

## Description

This project was for my final year project at the end of my Computer Science degree.

The main aim for this project was to design a web application that gamifies the act of betting and allowing users to track their progress. This is to create a competitive environment for users to encourage them to improve their methods and improve their personal success rate.

My personal reasons for choosing this project were to:

• Improve my knowledge of web applications and the process of designing and implementing one.

• Apply what I have learned over the past 4 years of my degree to the project.

• Improve my skills in Java and improve my knowledge of different libraries and functionalities I have not previously worked with.


I learnt many different methods and tools during this project, including how to:

• Create a Java web application using Servlet.

• Create a working database that is connected to the Java project – queries ran from the Java application should show on the database.

• Have a secure system that only allows registered users to access information.

• Allow users to view current markets and place bets through their connected Betfair account.

• Show users their personal statistics so they can track their own progress.

• Implement a user leader board so users can track their success rate compared to others.

## Installation

To run the project you will need to create a DB with the following fields:

Username varchar(255), BetsPlaced int, BetsWon int, SuccessRate int, Email varchar(255), Password varchar(255)

And populate these fields with data (at least 10 to fill the leaderboard). Edit the DBUtil class to the path of where your DB is stored. Then, running the code should take you to a web page where you can login with credentials from the DB, and view the leaderboard. If you don't want to fill the DB through SQL or want to add a single other account, you can register for an account on the web page, but you need to add the values in on the DB in order for the account to show on the leaderboard.
