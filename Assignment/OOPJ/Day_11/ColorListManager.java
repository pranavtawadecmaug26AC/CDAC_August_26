
import java.util.ArrayList;
import java.util.List;

public class ColorListManager {

    // Task 1: Create a new array list, add colors, and print out the collection.
    public List<String> createColorList() {
        // Using the List interface 
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("1. Initial List: " + colors);
        return colors;
    }

    // Task 2: Insert an element into the array list at the first position.
    public void insertAtFirstPosition(List<String> list, String color) {
        if (list != null) {
            list.add(0, color);
            System.out.println("2. After inserting '" + color + "' at the first position: " + list);
        }
    }

// Task 3: Retrieve an element (at a specified index) from a given array list.
    public void retrieveElement(List<String> list, int index) {
        // Bounds checking to prevent IndexOutOfBoundsException
        if (list != null && index >= 0 && index < list.size()) {
            String element = list.get(index);
            System.out.println("3. Element at index " + index + ": " + element);
        } else {
            System.out.println("3. Invalid index provided for retrieval.");
        }
    }

    
    // Task 4: Update specific array element by given element.
 
    public void updateElement(List<String> list, int index, String newColor) {
        if (list != null && index >= 0 && index < list.size()) {
            String oldColor = list.set(index, newColor);
            System.out.println("4. Updated index " + index + " from '" + oldColor + "' to '" + newColor + "': " + list);
        } else {
            System.out.println("4. Invalid index provided for update.");
        }
    }

    
    // Task 5: Remove the third element from an array list.
    public void removeThirdElement(List<String> list) {
        // The third element is at index 2 (0-based indexing)
        if (list != null && list.size() >= 3) {
            String removedColor = list.remove(2);
            System.out.println("5. Removed the third element ('" + removedColor + "'): " + list);
        } else {
            System.out.println("5. List does not have a third element to remove.");
        }
    }


    // Task 6: Search an element in an array list.
    public void searchElement(List<String> list, String searchColor) {
        if (list != null) {
            if (list.contains(searchColor)) {
                int index = list.indexOf(searchColor);
                System.out.println("6. Found '" + searchColor + "' at index: " + index);
            } else {
                System.out.println("6. Element '" + searchColor + "' not found in the list.");
            }
        }
    }

    // --- Main Method to test the modular functions ---
    public static void main(String[] args) {
        ColorListManager manager = new ColorListManager();

        // 1. Create and print
        List<String> myColors = manager.createColorList();

        // 2. Insert at first position
        manager.insertAtFirstPosition(myColors, "Purple");

        // 3. Retrieve element at index 3
        manager.retrieveElement(myColors, 3);

        // 4. Update the element at index 1
        manager.updateElement(myColors, 1, "Orange");

        // 5. Remove the third element (index 2)
        manager.removeThirdElement(myColors);

        // 6. Search for an element
        manager.searchElement(myColors, "Green");
        manager.searchElement(myColors, "Black"); // Testing a negative scenario
    }
}
