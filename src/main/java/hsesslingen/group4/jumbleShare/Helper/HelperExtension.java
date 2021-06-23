package hsesslingen.group4.jumbleShare.Helper;

public class HelperExtension
{
    public static String hexToStr(String guid) {
        return guid.replaceAll("(.{8})(.{4})(.{4})(.{4})(.{12})", "$1-$2-$3-$4-$5").replaceAll("(.{2})(.{2})(.{2})(.{2}).(.{2})(.{2}).(.{2})(.{2})(.{18})", "$4$3$2$1-$6$5-$8$7$9");
    }
}
