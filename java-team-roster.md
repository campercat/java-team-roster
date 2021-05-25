You have been commissioned by the Olympic Committee to build the official curling website. Lucky you!

## Getting Started

```no-highlight
et get java-team-roster
cd java-team-roster
idea .
```

## Learning Objectives

- Build a Java application to serve dynamically generated HTML
- Understand the role of the server, models, and views in a Java application

Don't worry - you don't have to understand the game of curling to complete these requirements.

We have supplied a `League` with relevant `Team` and `Player` data for you to accomplish the user stories below. You will likely have multiple calls to `League.getLeague()` to build the required data.

## Core User Stories

### View Linked List of Teams

```no-highlight
As a curling fan
I want to see a list of teams
So that I can learn more about them
```

Acceptance Criteria:

- When I navigate to `/` I get an unordered list of team names from `League`
- Each team name is a link that sends me to `/team?teamIndex=<index in array>`

### View Teams

```no-highlight
As a curling fan
I want to see a team roster
So that I can learn more about my favorite team
```

Acceptance Criteria:

- When I navigate to `/team?teamIndex=<index in array>`, I receive details about the team located at that index in the League's list of teams
- I should see the team's name, as well as a list of all of the players and their correlating positions
- If I attempt to access an index that is out of range for the list of teams, I receive a 404

### Add a player

```no-highlight
As a curling fan
I want to add a player
So that I can expand my teams in the future
```

Acceptance Criteria:

- When I navigate to `/player/new/`, I am presented with a form to take in Player data - name and position
- Once I submit the form, I process the data, and then I am presented with a Player show page shows the Player information that I just submitted
- The data I submitted via the form will not be persisted or saved, so I will not see it when I navigate to `/` or in any teams

## Non-Core User Stories

### List Positions

```no-highlight
As a curling fan
I want to see a list of positions
So that I can learn more about the players that occupy them
```

Acceptance Criteria:

- When I navigate to `/positions`, I can see an unordered list of all positions in the game of curling.
- Each position should be a link that sends me to `/position?name=<position-name>`

### List Players in Position

```no-highlight
As a curling fan
I want to see a list of players that play a certain position
So I can study the matchups
```

Acceptance Criteria:

- When I navigate to `/position?name=<position-name>`, I can see the position name, as well as all of the players that play the position in the league.
- The player's team should also be listed in a way that helps me understand what team each player is on

**You can add methods to the supplied classes, but you may not modify the data provided.**

You may create utility classes or other helpers to complete this challenge.
