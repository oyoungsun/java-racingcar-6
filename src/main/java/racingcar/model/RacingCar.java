package racingcar.model;


public class RacingCar {
    private static int distance;
    private static String name;


    private RacingCar(String name) {
        this.name = name;
        this.distance = Constants.CAR_INIT_DISTANCE;
    }

    public static RacingCar from(String name) {
        if (!validateCarName(name)) {
            throw new IllegalArgumentException(ExceptionMessages.NAME_RANGE_EXCEPTION);
        }
        return new RacingCar(name);
    }

    private static boolean validateCarName(String name) {
        return checkNotEmpty(name) && checkLength(name) && checkSymbol(name);
    }

    private static boolean checkSymbol(String name) {
        return !name.matches(Constants.MATCH_REGEX+Constants.PARSER_REGEX+Constants.MATCH_REGEX);
    }

    private static boolean checkNotEmpty(String name) {
        return name.trim().length() != Constants.NAME_MIN_LENGTH;
    }

    private static boolean checkLength(String name) {
        return name.length() < Constants.NAME_MAX_LENGTH;
    }

}
