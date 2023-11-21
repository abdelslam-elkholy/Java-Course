public class Fish extends Animal{


        public Fish(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {
            if (type == "Golden")
            {
                System.out.println("Swimming Fast");
            }
            else {
                System.out.println("Swimmingg Slow");
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
