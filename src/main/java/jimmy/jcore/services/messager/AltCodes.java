package jimmy.jcore.services.messager;

public enum AltCodes {

    ZODIAC_ARIES("♈"),
    ZODIAC_TAURUS("♉"),
    ZODIAC_GEMINI("♊"),
    ZODIAC_CANCER("♋"),
    ZODIAC_LEO("♌"),
    ZODIAC_VIRGO("♍"),
    ZODIAC_LIBRA("♎"),
    ZODIAC_SCORPIO("♏"),
    ZODIAC_SAGITTARIUS("♐"),
    ZODIAC_CAPRICORN("♑"),
    ZODIAC_AQUARIUS("♓"),
    ZODIAC_PISCES("♒"),
    PLANET_MERCURY("☿"),
    PLANET_VENUS("♀"),
    PLANET_EARTH("♁"),
    PLANET_MARS("♂"),
    PLANET_JUPITER("♃"),
    PLANET_SATURN("♄"),
    PLANET_URANUS("♅"),
    PLANET_NEPTUNE("♆"),
    PLANET_PLUTO("♇"),
    STAR("★"),
    BOW_AND_ARROW("♐"),
    HOLLOW_STAR("☆"),
    CIRCLE_STAR("⍟"),
    FILLED_CIRCLE_STAR("✪"),
    RADIOACTIVE("☢"),
    BIOHAZARD("☣"),
    PHONE("☎"),
    HOLLOW_PHONE("☏"),
    PHONE_CIRCLED("✆"),
    HOLLOW_TARGET("⦾"),
    TARGET("⦿"),
    CHECKMARK("✓"),
    THICK_CHECKMARK("✔"),
    HOLLOW_CHECKMARK("✅"),
    THICK_X("✖"),
    CHECKED_BOX("☑"),
    INFINITY("∞"),
    GREEK_CROSS("☩"),
    THICK_CROSS("✚"),
    SKULL_AND_CROSSBONES("☠"),
    SNOWFLAKE("❄"),
    TIGHT_SNOWFLAKE("❅"),
    HEAVY_SNOWFLAKE("❆"),
    RECYLCE_SYMBOL("♻"),
    SMILEY_FACE_HOLLOW("☺"),
    SMILY_FACE_FILLED("☻"),
    SUN_HOLLOW("☼"),
    SUN_FILLED("☀"),
    CROSSHAIR_TARGET("☉"),
    COMET("☄"),
    LIGHTNING("☇"),
    CLOUD("☁"),
    STORMY_WEATHER("⛈"),
    MALE("♂"),
    FEMALE("♀"),
    HEART("♥"),
    HOLLOW_HEART("♡"),
    TAPERED_HEART("❤"),
    DIAMOND_SUIT("♦"),
    MUSIC_NOTE_SINGE("♪"),
    MUSIC_NOTE_DOUBLE("♫"),
    BROKER_VERTICAL_BAR("¦"),
    DEGREE("º"),
    BULLET_POINT("•"),
    LEFT_ARROW_SKINNY("←"),
    UP_ARROW_SKINNY("↑"),
    RIGHT_ARROW_SKINNY("→"),
    DOWN_ARROW_SKINNY("↓"),
    HORIZONTAL_DOUBLE_ARROW_SKINNY("↔"),
    VERTICAL_DOUBLE_ARROW_SKINNY("↕"),
    LOZENGE("◊"),
    HOLLOW_CIRCLE("○"),
    FILLED_CIRCLE("●"),
    FILLED_SQUARE_HOLLOW_CENTER("◘"),
    HOLLOW_SQUARE_FILLED_CENTER("◙"),
    HOLLOW_BULLET_POINT("◦"),
    RECTANGLE("▬"),
    ARROW_UP("▲"),
    ARROW_RIGHT("►"),
    ARROW_DOWN("▼"),
    ARROW_LEFT("◄"),
    FILLED_SQUARE("■"),
    HOLLOW_SQUARE("□"),
    NEW_SHEQEL("₪"),
    SECTION("§"),
    DAGGER("†"),
    DOUBLE_DAGGER("‡"),
    CROSSED_SWORDS("⚔"),
    HOUSE("⌂"),
    DARK_SHADE("▓"),
    MEDIUM_SHADE("▒"),
    LIGHT_SHADE("░");

    private String sign;

    AltCodes(String sign){
        this.sign = sign;
    }

    public String getSign(){return sign;}

}
