package de.telran.khakov.rustam.classworks.cw22;

public class MatchResult {
    int year;
    int month;
    int dayOfMonth;
    String firstTeam;
    String secondTeam;
    int firstTeamBalls;
    int secondTeamBalls;
    public int wathcers;
    public String stadiumName;

    //2022, 11, 12, Werder Bremen, 1:02, RB Leipzig, 41500, Weser-Stadion
    public MatchResult(String line) {
        String[] column = line.split(", ");
        this.year = Integer.valueOf(column[0]);
        this.month = Integer.valueOf(column[1]);
        this.dayOfMonth = Integer.valueOf(column[2]);
        this.firstTeam = column[3];
        String result = column[4];
        String[] balls = result.split(":");
        firstTeamBalls = Integer.valueOf(balls[0]);
        secondTeamBalls = Integer.valueOf(balls[1]);
        this.secondTeam = column[5];
        if (!"NULL".equals(column[6])) {
           wathcers = Integer.valueOf(column[6]);
        }
        if (!"NULL".equals(column[7])) {
            stadiumName = column[7];
        }

    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                ", firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", firstTeamBalls=" + firstTeamBalls +
                ", secondTeamBalls=" + secondTeamBalls +
                ", wathcers=" + wathcers +
                ", stadiumName='" + stadiumName + '\'' +
                '}';
    }
}
