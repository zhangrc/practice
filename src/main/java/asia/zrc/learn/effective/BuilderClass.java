package asia.zrc.learn.effective;

/**
 * Created by zrc on 2017/3/7.
 */
public class BuilderClass {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int carbohydrate =0;
        private int sodium = 0;

        public Builder(int servingSize,int servings) {
            this.servings= servings;
            this.servingSize = servingSize;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder setSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public BuilderClass build() {
            return new BuilderClass(this);
        }
    }

    private BuilderClass(Builder builder) {
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
        this.servingSize = builder.servingSize;
    }
}
