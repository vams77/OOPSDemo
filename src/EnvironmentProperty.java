
class EnvironmentProperty {
    /** Constructor. */
    protected  EnvironmentProperty() {
    }
public static void main(final String[] args) {
       System.out.println(System.getProperty("java.class.path"));
       System.out.println(System.getProperty("java.home"));
       System.out.println(System.getProperty("java.class.version"));
       System.out.println(System.getProperty("java.specification.vendor"));
       System.out.println(System.getProperty("java.specification.version"));
       System.out.println(System.getProperty("java.vendor"));
       System.out.println(System.getProperty("java.vendor.url"));
       System.out.println(System.getProperty("java.version"));
       System.out.println(System.getProperty("java.vm.name"));
        String []arr1 = {"a", "b", "c"};
        String []arr2 = {"d", "e", "f"};
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Array1 position :" + i + " Value: " + arr1[i]);
            System.out.println("Array2 position :" + i + " Value: " + arr2[i]);
        }
    } 
}