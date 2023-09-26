public class BlueRayDisk {

    String title, director;
    int yearOfRelease;
    double cost;

    public BlueRayDisk(String title, String director, int yearOfRelease, double cost) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.cost = cost;
    }

    @Override
    public String toString() {

        return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
    }
}
