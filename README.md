# Football World Cup Scoreboard

A lightweight Java library for managing a live football scoreboard. Built with clean object-oriented design and test-driven development.

---

## Overview

The `football-world-cup-scoreboard` library allows you to:

- Start a game between two teams
- Update scores for ongoing games
- Finish games to remove them from the scoreboard
- Retrieve a summary of all games, ordered by total score (and most recent)

---

## Installation & Build

To build the library from source, you will need:

- Java 11 or higher
- [Apache Maven](https://maven.apache.org/) installed and configured

Clone the repository and build the project:

```bash
git clone https://github.com/helloromiro/football-world-cup-scoreboard.git
cd football-world-cup-scoreboard
mvn clean package
```

After a successful build, the JAR file will be available at:

```
target/scoreboard-1.0-SNAPSHOT.jar
```

---

## How to Use the JAR Library

### Option 1: Running the built-in demo

You can run the included demo class (`Main.java`) to see how the library works.

```bash
javac -cp target/scoreboard-1.0-SNAPSHOT.jar src/main/java/com/romiro/scoreboard/Main.java
java -cp target/scoreboard-1.0-SNAPSHOT.jar:src/main/java com.romiro.scoreboard.Main
```

> On Windows, use `;` instead of `:` in the classpath.

### Option 2: Using in your own project

1. Copy the built JAR (`scoreboard-1.0-SNAPSHOT.jar`) into the `lib/` directory of your project
2. Reference it in your code:

```java
import com.romiro.scoreboard.Scoreboard;

public class YourApp {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startGame("Germany", "France");
        scoreboard.updateScore("Germany", "France", 2, 2);
        scoreboard.getSummary().forEach(System.out::println);
    }
}
```

3. Compile and run:

```bash
javac -cp lib/scoreboard-1.0-SNAPSHOT.jar YourApp.java
java -cp lib/scoreboard-1.0-SNAPSHOT.jar:. YourApp
```

---

## API Reference

### Scoreboard

| Method | Description |
|--------|-------------|
| `startGame(String homeTeam, String awayTeam)` | Starts a new match |
| `updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore)` | Updates the score of a match |
| `finishGame(String homeTeam, String awayTeam)` | Removes the match from the scoreboard |
| `getSummary()` | Returns a list of matches sorted by total score (desc) and insertion order (desc) |

---

## Testing

This project includes both unit and integration tests using JUnit 5.

To run tests:

```bash
mvn test
```

---

## Project Structure

```
src/
  main/java/com/romiro/scoreboard/
    Match.java
    Scoreboard.java
    Main.java (optional demo)
  test/java/com/romiro/scoreboard/
    MatchTest.java
    ScoreboardIntegrationTest.java
```
