<div class="col-lg-12">
    <h4>Book a new Car</h4>
    <form class="form-horizontal" enctype="multipart/form-data">

        <div class="col-lg-12">
            <div class="form-group" >
            <label for="inputVehicle1" class="col-sm-2 control-label">From Date</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="inputVehicle1" placeholder="12/01/2016" required="">
            </div>
        </div>
            <div class="form-group">
                <label for="inputVehicle2" class="col-sm-2 control-label">To Date*</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputVehicle2"  placeholder="12/03/2016" required="">
                </div>
            </div>
        </div>



        <div class="form-group">
            <label for="inputVehicle3"  class="col-sm-2 control-label">Need a Driver?</label>
            <div class="col-sm-3">

                <select class="form-control"  id="inputVehicle3">
                    <option>Yes </option>
                    <option>No</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Purpose of Booking</label>
            <div class="col-sm-8">
                <textarea class="form-control" rows="3" id="inputVehicle4" placeholder="Describe your purpose you intent to use the vehicle and the region you wil be visiting"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Additional Comments</label>
            <div class="col-sm-8">
                <textarea class="form-control" rows="3"  id="inputVehicle5" placeholder="Describe your purpose you intent to use the vehicle and the region you wil be visiting"></textarea>
            </div>
        </div>



        <div class="col-lg-8">
            <a class="btn btn-success"  onclick="car.saveBook()">Save</a>
        </div>

    </form>



</div>

<%--<div>
    <h4>Region Details </h4>
    <form >

        <div class="panel panel-default col-lg-8 " >

            <div class="panel-body">
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon">Region Name</span>
                        <input type="text" class="form-control" placeholder="region manager" id="region-name" required="">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon">Description</span>
                        <input type="text" class="form-control" placeholder="region manager" id="region-descr" required="">
                    </div>
                </div>

                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon">Region Manager</span>
                        <input type="text" class="form-control" placeholder="region manager" id="region-namager" required="">
                    </div>
                </div>

            </div>
        </div>

    </form>
    <div class="col-lg-8">
        <a class="btn btn-success"  onclick="car.save1()">Save</a>
    </div>
</div>--%>




