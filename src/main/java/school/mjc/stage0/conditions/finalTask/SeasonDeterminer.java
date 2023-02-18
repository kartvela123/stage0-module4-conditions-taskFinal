package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case(1):
            case(2):
            case(12):
                System.out.println("winter");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("spring");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("summer");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("autumn");
                break;
            default:
                System.out.println("invalid number of month!");
                break;
        }
        }

    }

