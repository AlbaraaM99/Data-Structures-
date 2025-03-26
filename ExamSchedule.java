public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }

    // Task 2: Add exam to the end of the linked list
    public void addExam(String examDetails) {
        ExamNode newNode = new ExamNode(examDetails);

        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            ExamNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        System.out.println("Exam added: " + examDetails);
    }

    // Task 3: View next exam
    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else if (current.next == null) {
            System.out.println("You are at the last exam. No next exam available.");
        } else {
            current = current.next;
            System.out.println("Next Exam: " + current.examDetails);
        }
    }

    // Task 4: View previous exam
    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else if (current.prev == null) {
            System.out.println("You are at the first exam. No previous exam available.");
        } else {
            current = current.prev;
            System.out.println("Previous Exam: " + current.examDetails);
        }
    }

    // View all exams
    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}
