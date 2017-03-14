package asia.zrc.util;

/**
 * Created by zrc on 2017/3/14.
 */
public class SystemTime {
    private static TimeSource timeSource;

    public static long asMillis() {
        return getTimeSource().millis();
    }

    public static void reset() {
        setTimeSource(null);
    }

    public static void setTimeSource(TimeSource timeSource) {
        SystemTime.timeSource = timeSource;
    }

    public static TimeSource getTimeSource() {
        return timeSource == null ? defalutTimeSouce : timeSource;
    }

    private static final TimeSource defalutTimeSouce = new TimeSource() {
        @Override
        public long millis() {
            return System.currentTimeMillis();
        }
    };
}
