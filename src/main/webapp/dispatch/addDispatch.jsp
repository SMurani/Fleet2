
<div class="col-lg-12">
    <h4>Vehicle Dipatch Details</h4>
    <form class="form-horizontal" enctype="multipart/form-data" method="POST" action="./fileUpload">

        <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control"name="dipatchVehicle"  id="inputVehicle1" placeholder="first name">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle2" class="col-sm-2 control-label">Client</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="dispatchClient"  id="inputVehicle2" placeholder="ID nO">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3" class="col-sm-2 control-label">Return Date</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="dispatchReturnDate"  id="inputVehicle3" placeholder="e.g Nairobi">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Document</label>
            <div class="col-sm-8">
                <input type="file" name="dispatchDoc"  id="inputVehicle4" >
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" name="dispatchCommet" id="inputVehicle5"></textarea>
            </div>
        </div>
<div class="col-lg-10">
<button type="submit" class="btn btn-success pull-right" >Save</button>
</div>

    </form>

</div>
