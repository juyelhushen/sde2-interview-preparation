package low_level_design.hotet_managment_system.design.state.room;

import low_level_design.hotet_managment_system.enums.RoomStatus;

public interface RoomState {
    RoomStatus getStatus();
}
