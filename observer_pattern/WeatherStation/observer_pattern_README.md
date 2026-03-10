# Weather Station Observer Pattern Example

## Overview

This project demonstrates the **Observer Pattern** in Java by using a simple **Weather Station** example.

In this design:

- `WeatherData` is the **Subject**
- display classes such as `CurrentConditionsDisplay`, `StatisticsDisplay`, and `ForecastDisplay` are **Observers**
- when weather measurements change, all registered displays are updated automatically


## Source Note

The structure and example used in this project are based on the **Weather Station / Observer Pattern** example presented in the book:

**Head First Design Patterns**  
Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

This code is prepared for educational purposes to help students practice the Observer Pattern and basic object-oriented programming concepts in Java.

## Project Files

Make sure these files are in the same folder:

- `Subject.java`
- `Observer.java`
- `DisplayElement.java`
- `WeatherData.java`
- `CurrentConditionsDisplay.java`
- `StatisticsDisplay.java`
- `ForecastDisplay.java`
- `WeatherStation.java`

## How the Project Works

### Subject
The subject is the object that stores the changing data.

In this project:

- `WeatherData` stores:
  - temperature
  - humidity
  - pressure

It also:

- registers observers
- removes observers
- notifies observers when measurements change

### Observers
Observers are the display classes that want to receive updates.

In this project:

- `CurrentConditionsDisplay`
- `StatisticsDisplay`
- `ForecastDisplay`

Each observer registers itself with `WeatherData` and receives updated values through the `update(...)` method.

## How to Compile and Run

### 1. Open the project folder

Open **PowerShell**, **Command Prompt**, or a terminal in the folder where the `.java` files are stored.

### 2. Compile the code

```javac *.java```

### 3. Run the code  

```java WeatherStation````
