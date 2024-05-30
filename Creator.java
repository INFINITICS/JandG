interface CreateDelta {
        public void Delta();
}

interface CreateBeta {
        public void Beta();
}

/**============================================================**/
class DemoClass implements CreateDelta, CreateBeta {
        public void Delta()
        {
                System.out.println("Creating domain Delta...");
        }

        public void Beta()
        {
                System.out.println("Creating domain Beta...");
        }

}

