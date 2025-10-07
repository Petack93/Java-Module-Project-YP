public class Race {
    String leaderName = "";
     int leaderDistance = 0;

    public void checkLeader(Car car) {
        int distance = 24 * car.speed;
        if (distance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = distance;
        }
    }
}

