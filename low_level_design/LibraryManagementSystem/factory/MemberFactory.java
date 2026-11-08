package low_level_design.LibraryManagementSystem.factory;

import low_level_design.LibraryManagementSystem.entity.Member;
import low_level_design.LibraryManagementSystem.enums.MemberType;

import java.time.LocalDate;

public final class MemberFactory {

    private MemberFactory() {
    }

    public static Member create(String personId,
                                String name, String phone,
                                MemberType memberType,
                                LocalDate membershipExpiryDate) {
        return new Member(personId, name, phone, memberType, membershipExpiryDate);
    }
}
