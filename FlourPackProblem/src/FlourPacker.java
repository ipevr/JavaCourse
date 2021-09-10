public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int WEIGHT_OF_BIG_FLOWER_PACK = 5;
        final int WEIGHT_OF_SMALL_FLOWER_PACK = 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 0; i <= bigCount * WEIGHT_OF_BIG_FLOWER_PACK; i += WEIGHT_OF_BIG_FLOWER_PACK) {
            for (int j = 0; j <= smallCount * WEIGHT_OF_SMALL_FLOWER_PACK; j += WEIGHT_OF_SMALL_FLOWER_PACK) {
                int sum = i + j;

                if (sum == goal){
                    return true;
                }
            }
        }

        return false;
    }
}
