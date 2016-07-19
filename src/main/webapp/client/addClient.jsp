<%--<div>
<h4>Client Details </h4>
<form >

    <div class="panel panel-default col-lg-8 " >

        <div class="panel-body">
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Client Name</span>
                    <input type="text" class="form-control" placeholder="client manager" id="client-name" required="">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Description</span>
                    <input type="text" class="form-control" placeholder="client manager" id="client-descr" required="">
                </div>
            </div>

            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Client Manager</span>
                    <input type="text" class="form-control" placeholder="client manager" id="client-namager" required="">
                </div>
            </div>

        </div>
    </div>
  
</form>
<div class="col-lg-8">
<a class="btn btn-success"  onclick="client.save()">Save</a>
</div>
</div>--%>

<div class="col-lg-12">
    <h4>Register new Client</h4>
    <form class="form-horizontal"  enctype="multipart/form-data">

        <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Client Name*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle1" placeholder="name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2" class="col-sm-2 control-label">ID Number/RegNo</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle2" placeholder="ID no/Comp RegNo">
            </div>
        </div>

        <h4>Client Address Details</h4>
        <div class="form-group">
            <label for="inputVehicle3" class="col-sm-2 control-label">Phone No</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle3" placeholder="phone number">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Email Address</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle4" placeholder="email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">City</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle5" placeholder="city">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6" class="col-sm-2 control-label">Country</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle6" placeholder="country">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle7" class="col-sm-2 control-label">Box</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle7" placeholder="Box">
            </div>
        </div>


    </form>
    <div class="col-lg-10">
        <a class="btn btn-success pull-right"  onclick="client.save()">Save</a>
    </div>
</div>
