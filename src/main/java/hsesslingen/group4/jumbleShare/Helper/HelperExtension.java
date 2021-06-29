package hsesslingen.group4.jumbleShare.Helper;

import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class HelperExtension
{
    public static String hexToStr(String guid)
    {
        return guid.replaceAll("(.{8})(.{4})(.{4})(.{4})(.{12})", "$1-$2-$3-$4-$5").replaceAll("(.{2})(.{2})(.{2})(.{2}).(.{2})(.{2}).(.{2})(.{2})(.{18})", "$4$3$2$1-$6$5-$8$7$9");
    }

    //Checks if a Java UUID is equal to a SQL GUID by converting and only comparing the last eight characters
    public static boolean UuidEqualityCheck(String uuid, String guid)
    {
        uuid = uuid.toLowerCase(Locale.ROOT);
        uuid = uuid.replaceAll("-", "");
        uuid = uuid.substring(uuid.length() - 8);

        var parsedGuid = HelperExtension.hexToStr(guid);
        parsedGuid = parsedGuid.replaceAll("-","");
        parsedGuid = parsedGuid.substring(parsedGuid.length() - 8);

        return uuid.contentEquals(parsedGuid);
    }

    public static boolean UuidEqualityCheck(UUID uuid, UUID guid)
    {
        var uuidParsed = uuid.toString();
        var guidParsed = guid.toString();

        uuidParsed = uuidParsed.toLowerCase(Locale.ROOT);
        uuidParsed = uuidParsed.replaceAll("-", "");
        uuidParsed = uuidParsed.substring(uuidParsed.length() - 8);

        var parsedGuid = HelperExtension.hexToStr(guidParsed);
        parsedGuid = parsedGuid.replaceAll("-","");
        parsedGuid = parsedGuid.substring(parsedGuid.length() - 8);

        return uuidParsed.contentEquals(parsedGuid);
    }

    public static double GetTimespanInMinutes(Date start, Date end)
    {
        var diffMinutes = (end.getTime() - start.getTime()) / (60 * 1000);
        return Math.ceil(diffMinutes);
    }


}
