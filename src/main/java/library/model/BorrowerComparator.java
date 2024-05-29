package library.model;

import library.enums.Role;

import java.util.Comparator;

public class BorrowerComparator implements Comparator<Borrower> {
    @Override
    public int compare(Borrower b1, Borrower b2) {

        if (b1.getRole().equals(Role.TEACHER) && !b2.getRole().equals(Role.TEACHER)) {
            return 1;
        } else if (!b1.getRole().equals(Role.TEACHER) && b2.getRole().equals(Role.TEACHER)) {
            return -1;
        } else if (b1.getRole().equals(Role.SENIOR_STUDENT) && !b2.getRole().equals(Role.SENIOR_STUDENT)) {
            return 1;
        } else if (!b1.getRole().equals(Role.SENIOR_STUDENT) && b2.getRole().equals(Role.SENIOR_STUDENT)) {
            return -1;
        } else {
            return 0;
        }
    }
//    @Override
//    public int compare(Borrower b1, Borrower b2) {
//
//        int priority1 = getPriority(b1.getRole());
//        int priority2 = getPriority(b2.getRole());
//
//
//        return Integer.compare(priority2, priority1);
//    }
//
//    public int getPriority(Role role) {
//        switch (role) {
//            case TEACHER:
//                return 3;
//            case SENIOR_STUDENT:
//                return 2;
//            case JUNIOR_STUDENT:
//                return 1;
//            default:
//                return 0;
//        }
//    }
}

