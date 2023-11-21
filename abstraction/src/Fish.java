public class Fish extends Animal{


        public Fish(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {
            if (type == "Golden")
            {
                System.out.println(getTypeName() +  " Swimming Fast");
            }
            else {
                System.out.println(getTypeName() + "Swimmingg Slow");
            }
        }

        @Override
        public void makeNoise() {

            if (type == "Golden")
            {
                System.out.println("Fish .. Fish");
            }
            else {
                System.out.println("Fish");
            }
        }


}
