// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class StopArm extends Table {
  public static StopArm getRootAsStopArm(ByteBuffer _bb) { return getRootAsStopArm(_bb, new StopArm()); }
  public static StopArm getRootAsStopArm(ByteBuffer _bb, StopArm obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public StopArm __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }


  public static void startStopArm(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endStopArm(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

